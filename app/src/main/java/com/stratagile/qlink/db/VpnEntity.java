package com.stratagile.qlink.db;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.util.Log;

import com.socks.library.KLog;
import com.stratagile.qlink.utils.ToastUtil;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by huzhipeng on 2018/2/7.
 * vpn的实体类
 */

@Entity
public class VpnEntity implements Parcelable, Comparable<VpnEntity> {
    @Id(autoincrement = true)
    private Long id;
    /**
     * vpn注册的所在的国家
     */
    private String country;

    private boolean isMainNet;

    @Override
    public String toString() {
        return "VpnEntity{" +
                "id=" + id +
                ", country='" + country + '\'' +
                ", isMainNet=" + isMainNet +
                ", hash='" + hash + '\'' +
                ", userId='" + userId + '\'' +
                ", profileLocalPath='" + profileLocalPath + '\'' +
                ", password='" + password + '\'' +
                ", privateKeyPassword='" + privateKeyPassword + '\'' +
                ", profileUUid='" + profileUUid + '\'' +
                ", ipV4Address='" + ipV4Address + '\'' +
                ", continent='" + continent + '\'' +
                ", username='" + username + '\'' +
                ", groupNum=" + groupNum +
                ", bandwidth='" + bandwidth + '\'' +
                ", connectMaxnumber=" + connectMaxnumber +
                ", assetTranfer=" + assetTranfer +
                ", avatar='" + avatar + '\'' +
                ", registerQlc=" + registerQlc +
                ", onlineTime=" + onlineTime +
                ", connsuccessNum=" + connsuccessNum +
                ", isInMainWallet=" + isInMainWallet +
                ", unReadMessageCount=" + unReadMessageCount +
                ", friendNum='" + friendNum + '\'' +
                ", configuration='" + configuration + '\'' +
                ", vpnName='" + vpnName + '\'' +
                ", p2pId='" + p2pId + '\'' +
                ", p2pIdPc='" + p2pIdPc + '\'' +
                ", address='" + address + '\'' +
                ", type=" + type +
                ", currentConnect=" + currentConnect +
                ", qlc=" + qlc +
                ", isConnected=" + isConnected +
                ", lastFreeTime=" + lastFreeTime +
                ", online=" + online +
                ", isLoadingAvater=" + isLoadingAvater +
                ", avaterUpdateTime=" + avaterUpdateTime +
                ", price=" + price +
                '}';
    }

    /**
     * 配置文件的hash值
     */
    private String hash;


    protected VpnEntity(Parcel in) {
        if (in.readByte() == 0) {
            id = null;
        } else {
            id = in.readLong();
        }
        country = in.readString();
        isMainNet = in.readByte() != 0;
        hash = in.readString();
        userId = in.readString();
        profileLocalPath = in.readString();
        password = in.readString();
        privateKeyPassword = in.readString();
        profileUUid = in.readString();
        ipV4Address = in.readString();
        continent = in.readString();
        username = in.readString();
        groupNum = in.readInt();
        bandwidth = in.readString();
        connectMaxnumber = in.readInt();
        assetTranfer = in.readDouble();
        avatar = in.readString();
        registerQlc = in.readDouble();
        onlineTime = in.readInt();
        connsuccessNum = in.readInt();
        isInMainWallet = in.readByte() != 0;
        unReadMessageCount = in.readInt();
        friendNum = in.readString();
        configuration = in.readString();
        vpnName = in.readString();
        p2pId = in.readString();
        p2pIdPc = in.readString();
        address = in.readString();
        type = in.readInt();
        currentConnect = in.readInt();
        qlc = in.readFloat();
        isConnected = in.readByte() != 0;
        lastFreeTime = in.readLong();
        online = in.readByte() != 0;
        isLoadingAvater = in.readByte() != 0;
        avaterUpdateTime = in.readLong();
        price = in.readFloat();
    }

    public static final Creator<VpnEntity> CREATOR = new Creator<VpnEntity>() {
        @Override
        public VpnEntity createFromParcel(Parcel in) {
            return new VpnEntity(in);
        }

        @Override
        public VpnEntity[] newArray(int size) {
            return new VpnEntity[size];
        }
    };

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 同vpnName，没用
     */
    private String userId;
    /**
     * 配置文件在vpn注册者的手机中的存储地址，
     * 在连接着连接的时候，需要根据这个地址通过c层把配置文件传输给连接者。
     * 在注册或者修改vpn的配置文件的时候，会把这个配置文件复制到sd卡下的QLink目录下。使用的是QLink目录下的配置文件
     * 命名方式为 时间戳 + ".ovpn"
     */
    private String profileLocalPath;
    /**
     * 配置文件的密码
     */
    private String password;
    /**
     * 配置文件的私钥密码
     */
    private String privateKeyPassword;
    /**
     * vpn配置文件的标识，可以直接通过该标识找到配置文件
     */
    private String profileUUid;
    /**
     * ipv4地址
     */
    private String ipV4Address;
    /**
     * 洲
     */
    private String continent;

    /**
     * 配置文件的用户名
     */
    private String username;

    /**
     * 资产所对应的群组id
     */
    private int groupNum;


    /**
     * vpn注册之后的测试出来的带宽，现在没用到
     */
    private String bandwidth;
    /**
     * 允许的最大的连接数量
     */
    private int connectMaxnumber;

    /**
     * 资产的价值，别人想要抢注册这个资产需要扣除的钱
     */
    private double assetTranfer;

    private String avatar;

    /**
     * 注册时押注的qlc数量
     */
    private double registerQlc;

    /**
     * 在线的次数
     */
    private int onlineTime;

    /**
     * 连接成功的次数
     */
    private int connsuccessNum;

    private boolean isInMainWallet = false;//是否主网资产

    public int getUnReadMessageCount() {
        return unReadMessageCount;
    }

    public void setUnReadMessageCount(int unReadMessageCount) {
        this.unReadMessageCount = unReadMessageCount;
    }

    /**
     * 未读消息的个数
     */
    private int unReadMessageCount;

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    /**
     * 好友编号
     */
    private String friendNum;
    /**
     * 配置文件的名字
     */
    private String configuration;
    /**
     * vpn的名字
     */
    private String vpnName;
    /**
     * vpn注册者的p2pId
     */
    private String p2pId;

    /**
     * vpn注册者的电脑资产的p2pId
     */
    private String p2pIdPc;
    /**
     * 钱包地址
     */
    private String address;
    /**
     * 资产类型，vpn为3
     */
    private int type;
    /**
     * 当前连接的使用者的数量
     */
    private int currentConnect;
    /**
     * 使用者连接vpn时，每小时所需的qlc
     */
    private float qlc;
    /**
     * 在使用者方使用，用来辨别是否连接上了此vpn
     */
    private boolean isConnected;

    public long getLastFreeTime() {
        return lastFreeTime;
    }

    public void setLastFreeTime(long lastFreeTime) {
        this.lastFreeTime = lastFreeTime;
    }

    private long lastFreeTime = 0;

    @Generated(hash = 2103615292)
    public VpnEntity() {
    }

    @Generated(hash = 1350496477)
    public VpnEntity(Long id, String country, boolean isMainNet, String hash,
            String userId, String profileLocalPath, String password,
            String privateKeyPassword, String profileUUid, String ipV4Address,
            String continent, String username, int groupNum, String bandwidth,
            int connectMaxnumber, double assetTranfer, String avatar,
            double registerQlc, int onlineTime, int connsuccessNum,
            boolean isInMainWallet, int unReadMessageCount, String friendNum,
            String configuration, String vpnName, String p2pId, String p2pIdPc,
            String address, int type, int currentConnect, float qlc,
            boolean isConnected, long lastFreeTime, boolean online,
            boolean isLoadingAvater, long avaterUpdateTime, float price) {
        this.id = id;
        this.country = country;
        this.isMainNet = isMainNet;
        this.hash = hash;
        this.userId = userId;
        this.profileLocalPath = profileLocalPath;
        this.password = password;
        this.privateKeyPassword = privateKeyPassword;
        this.profileUUid = profileUUid;
        this.ipV4Address = ipV4Address;
        this.continent = continent;
        this.username = username;
        this.groupNum = groupNum;
        this.bandwidth = bandwidth;
        this.connectMaxnumber = connectMaxnumber;
        this.assetTranfer = assetTranfer;
        this.avatar = avatar;
        this.registerQlc = registerQlc;
        this.onlineTime = onlineTime;
        this.connsuccessNum = connsuccessNum;
        this.isInMainWallet = isInMainWallet;
        this.unReadMessageCount = unReadMessageCount;
        this.friendNum = friendNum;
        this.configuration = configuration;
        this.vpnName = vpnName;
        this.p2pId = p2pId;
        this.p2pIdPc = p2pIdPc;
        this.address = address;
        this.type = type;
        this.currentConnect = currentConnect;
        this.qlc = qlc;
        this.isConnected = isConnected;
        this.lastFreeTime = lastFreeTime;
        this.online = online;
        this.isLoadingAvater = isLoadingAvater;
        this.avaterUpdateTime = avaterUpdateTime;
        this.price = price;
    }

    public boolean isOnline() {
        return online;
    }

    public boolean isLoadingAvater() {
        return isLoadingAvater;
    }

    public void setLoadingAvater(boolean loadingAvater) {
        isLoadingAvater = loadingAvater;
    }

    private boolean online;
    /**
     * 是否正在下载头像
     *
     * @param in
     */

    private boolean isLoadingAvater;
    private long avaterUpdateTime;
    private float price;

 
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProfileLocalPath() {
        return this.profileLocalPath;
    }

    public void setProfileLocalPath(String profileLocalPath) {
        this.profileLocalPath = profileLocalPath;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBandwidth() {
        return this.bandwidth;
    }

    public void setBandwidth(String bandwidth) {
        this.bandwidth = bandwidth;
    }

    public int getConnectMaxnumber() {
        return this.connectMaxnumber;
    }

    public void setConnectMaxnumber(int connectMaxnumber) {
        this.connectMaxnumber = connectMaxnumber;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getFriendNum() {
        return this.friendNum;
    }

    public void setFriendNum(String friendNum) {
        this.friendNum = friendNum;
    }

    public boolean getIsLoadingAvater() {
        return this.isLoadingAvater;
    }

    public void setIsLoadingAvater(boolean isLoadingAvater) {
        this.isLoadingAvater = isLoadingAvater;
    }

    public long getAvaterUpdateTime() {
        return this.avaterUpdateTime;
    }

    public void setAvaterUpdateTime(long avaterUpdateTime) {
        this.avaterUpdateTime = avaterUpdateTime;
    }

    public String getVpnName() {
        return this.vpnName;
    }

    public void setVpnName(String vpnName) {
        this.vpnName = vpnName;
    }

    public String getP2pId() {
        return this.p2pId;
    }

    public void setP2pId(String p2pId) {
        this.p2pId = p2pId;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean getOnline() {
        return this.online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public int getCurrentConnect() {
        return this.currentConnect;
    }

    public void setCurrentConnect(int currentConnect) {
        this.currentConnect = currentConnect;
    }

    public float getQlc() {
        return this.qlc;
    }

    public void setQlc(float qlc) {
        this.qlc = qlc;
    }


    public String getConfiguration() {
        return this.configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }


    public String getPrivateKeyPassword() {
        return this.privateKeyPassword;
    }

    public void setPrivateKeyPassword(String privateKeyPassword) {
        this.privateKeyPassword = privateKeyPassword;
    }

    /**
     * 返回大于0，往前排，小于0，往后排，等于0，接着看后面的
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(@NonNull VpnEntity o) {

        int myIsonline = isOnline() ? 1 : 0;
        int anohterIsonline = o.isOnline() ? 1 : 0;
        int myIsConnect = getIsConnected() ? 1 : 0;
        int anotherIsConnect = o.getIsConnected() ? 1 : 0;
        int i =  anotherIsConnect - myIsConnect;   //比较是否连接
        if (i == 0) {
            i = anohterIsonline - myIsonline; //比较是否在线
            if (i == 0) {
                i = (int) (o.getAssetTranfer() - getAssetTranfer());  //比较资产值
                return i;
            } else {
                return i;
            }
        } else {
            return i;
        }
    }


    public String getProfileUUid() {
        return this.profileUUid;
    }


    public void setProfileUUid(String profileUUid) {
        this.profileUUid = profileUUid;
    }


    public String getIpV4Address() {
        return this.ipV4Address;
    }


    public void setIpV4Address(String ipV4Address) {
        this.ipV4Address = ipV4Address;
    }


    public boolean getIsConnected() {
        return this.isConnected;
    }


    public void setIsConnected(boolean isConnected) {
        this.isConnected = isConnected;
    }


    public String getContinent() {
        return this.continent;
    }


    public void setContinent(String continent) {
        this.continent = continent;
    }

    public double getAssetTranfer() {
        return this.assetTranfer;
    }

    public void setAssetTranfer(double assetTranfer) {
        this.assetTranfer = assetTranfer;
    }

    public double getRegisterQlc() {
        return this.registerQlc;
    }

    public void setRegisterQlc(double registerQlc) {
        this.registerQlc = registerQlc;
    }

    public boolean getIsInMainWallet() {
        return this.isInMainWallet;
    }

    public void setIsInMainWallet(boolean isInMainWallet) {
        this.isInMainWallet = isInMainWallet;
    }

   

    public int getOnlineTime() {
        return this.onlineTime;
    }

    public void setOnlineTime(int onlineTime) {
        this.onlineTime = onlineTime;
    }

    public int getConnsuccessNum() {
        return this.connsuccessNum;
    }

    public void setConnsuccessNum(int connsuccessNum) {
        this.connsuccessNum = connsuccessNum;
    }


    public boolean getIsMainNet() {
        return this.isMainNet;
    }

    public void setIsMainNet(boolean isMainNet) {
        this.isMainNet = isMainNet;
    }

    public String getP2pIdPc() {
        return this.p2pIdPc;
    }

    public void setP2pIdPc(String p2pIdPc) {
        this.p2pIdPc = p2pIdPc;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        if (id == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(id);
        }
        parcel.writeString(country);
        parcel.writeByte((byte) (isMainNet ? 1 : 0));
        parcel.writeString(hash);
        parcel.writeString(userId);
        parcel.writeString(profileLocalPath);
        parcel.writeString(password);
        parcel.writeString(privateKeyPassword);
        parcel.writeString(profileUUid);
        parcel.writeString(ipV4Address);
        parcel.writeString(continent);
        parcel.writeString(username);
        parcel.writeInt(groupNum);
        parcel.writeString(bandwidth);
        parcel.writeInt(connectMaxnumber);
        parcel.writeDouble(assetTranfer);
        parcel.writeString(avatar);
        parcel.writeDouble(registerQlc);
        parcel.writeInt(onlineTime);
        parcel.writeInt(connsuccessNum);
        parcel.writeByte((byte) (isInMainWallet ? 1 : 0));
        parcel.writeInt(unReadMessageCount);
        parcel.writeString(friendNum);
        parcel.writeString(configuration);
        parcel.writeString(vpnName);
        parcel.writeString(p2pId);
        parcel.writeString(p2pIdPc);
        parcel.writeString(address);
        parcel.writeInt(type);
        parcel.writeInt(currentConnect);
        parcel.writeFloat(qlc);
        parcel.writeByte((byte) (isConnected ? 1 : 0));
        parcel.writeLong(lastFreeTime);
        parcel.writeByte((byte) (online ? 1 : 0));
        parcel.writeByte((byte) (isLoadingAvater ? 1 : 0));
        parcel.writeLong(avaterUpdateTime);
        parcel.writeFloat(price);
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
}
