
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg.test;

import luban.*;


public final class Item extends cfg.test.ItemBase {
    public Item(ByteBuf _buf) { 
        super(_buf);
        num = _buf.readInt();
        price = _buf.readInt();
    }

    public static Item deserialize(ByteBuf _buf) {
            return new cfg.test.Item(_buf);
    }

    public final int num;
    public final int price;

    public static final int __ID__ = -1226641649;
    
    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public String toString() {
        return "{ "
        + "id:" + id + ","
        + "name:" + name + ","
        + "desc:" + desc + ","
        + "num:" + num + ","
        + "price:" + price + ","
        + "}";
    }
}

