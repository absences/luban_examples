
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg.test;

import luban.*;


public final class MultiUnionIndexList extends AbstractBean {
    public MultiUnionIndexList(ByteBuf _buf) { 
        id1 = _buf.readInt();
        id2 = _buf.readLong();
        id3 = _buf.readString();
        num = _buf.readInt();
        desc = _buf.readString();
    }

    public static MultiUnionIndexList deserialize(ByteBuf _buf) {
            return new cfg.test.MultiUnionIndexList(_buf);
    }

    public final int id1;
    public final long id2;
    public final String id3;
    public final int num;
    public final String desc;

    public static final int __ID__ = 1966847134;
    
    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public String toString() {
        return "{ "
        + "id1:" + id1 + ","
        + "id2:" + id2 + ","
        + "id3:" + id3 + ","
        + "num:" + num + ","
        + "desc:" + desc + ","
        + "}";
    }
}

