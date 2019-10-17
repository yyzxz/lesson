package com.guiyang.classselection.pojo.vo;

/**
 * ClassName: com.guiyang.classselection.pojo
 *
 * @author zhangya
 * @Description: ${todo}
 * @date 2019-10-15
 */
public class ReplyVO<T> {
    int errCode = 0;  //默认0为成功
    T obj = null;

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public ReplyVO(int errCode, T obj) {
        this.errCode = errCode;
        this.obj = obj;
    }

    public ReplyVO(T obj) {
        this.obj = obj;
    }

    public ReplyVO() {
    }
}
