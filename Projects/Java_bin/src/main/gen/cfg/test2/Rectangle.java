
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg.test2;

import luban.*;


/**
 * 矩形
 */
public final class Rectangle extends cfg.test.Shape {
    public Rectangle(ByteBuf _buf) { 
        super(_buf);
        width = _buf.readFloat();
        height = _buf.readFloat();
    }

    public static Rectangle deserialize(ByteBuf _buf) {
            return new cfg.test2.Rectangle(_buf);
    }

    /**
     * 宽度
     */
    public final float width;
    /**
     * 高度
     */
    public final float height;

    public static final int __ID__ = 694982337;
    
    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public String toString() {
        return "{ "
        + "width:" + width + ","
        + "height:" + height + ","
        + "}";
    }
}

