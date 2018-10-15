package com.niles.pandian_base.model;

/**
 * Created by Niles
 * Date 2018/10/15 09:04
 * Email niulinguo@163.com
 */
public class UserModel {

    private final String mUsername;
    private final String mPassword;
    private final String mUserNo;
    private final String mUserUnit;
    private final String mUserDept;
    private final String mUnitRange;
    private final String mDeptRange;
    private final String mToken;

    private UserModel(String username, String password, String userNo, String userUnit, String userDept, String unitRange, String deptRange, String token) {
        mUsername = username;
        mPassword = password;
        mUserNo = userNo;
        mUserUnit = userUnit;
        mUserDept = userDept;
        mUnitRange = unitRange;
        mDeptRange = deptRange;
        mToken = token;
    }

    public String getUsername() {
        return mUsername;
    }

    public String getPassword() {
        return mPassword;
    }

    public String getUserNo() {
        return mUserNo;
    }

    public String getUserUnit() {
        return mUserUnit;
    }

    public String getUserDept() {
        return mUserDept;
    }

    public String getUnitRange() {
        return mUnitRange;
    }

    public String getDeptRange() {
        return mDeptRange;
    }

    public String getToken() {
        return mToken;
    }

    public static final class Builder {

        private String mUsername;
        private String mPassword;
        private String mUserNo;
        private String mUserUnit;
        private String mUserDept;
        private String mUnitRange;
        private String mDeptRange;
        private String mToken;

        public String getUsername() {
            return mUsername;
        }

        public Builder setUsername(String username) {
            mUsername = username;
            return this;
        }

        public String getPassword() {
            return mPassword;
        }

        public Builder setPassword(String password) {
            mPassword = password;
            return this;
        }

        public String getUserNo() {
            return mUserNo;
        }

        public Builder setUserNo(String userNo) {
            mUserNo = userNo;
            return this;
        }

        public String getUserUnit() {
            return mUserUnit;
        }

        public Builder setUserUnit(String userUnit) {
            mUserUnit = userUnit;
            return this;
        }

        public String getUserDept() {
            return mUserDept;
        }

        public Builder setUserDept(String userDept) {
            mUserDept = userDept;
            return this;
        }

        public String getUnitRange() {
            return mUnitRange;
        }

        public Builder setUnitRange(String unitRange) {
            mUnitRange = unitRange;
            return this;
        }

        public String getDeptRange() {
            return mDeptRange;
        }

        public Builder setDeptRange(String deptRange) {
            mDeptRange = deptRange;
            return this;
        }

        public String getToken() {
            return mToken;
        }

        public Builder setToken(String token) {
            mToken = token;
            return this;
        }

        public UserModel build() {
            return new UserModel(
                    mUsername,
                    mPassword,
                    mUserNo,
                    mUserUnit,
                    mUserDept,
                    mUnitRange,
                    mDeptRange,
                    mToken
            );
        }
    }
}
