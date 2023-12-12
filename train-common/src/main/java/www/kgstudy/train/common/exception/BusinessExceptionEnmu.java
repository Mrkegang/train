package www.kgstudy.train.common.exception;

public enum BusinessExceptionEnmu {

    MEMBER_MOBILE_EXIST("手机号已注册");

    BusinessExceptionEnmu(String desc) {
        this.desc = desc;
    }

    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BusinessExceptionEnmu{");
        sb.append("desc='").append(desc).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
