
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg.test;

import luban.*;


public final class ExcelFromJsonMultiRow extends AbstractBean {
    public ExcelFromJsonMultiRow(ByteBuf _buf) { 
        id = _buf.readInt();
        x = _buf.readInt();
        {int __n0 = Math.min(_buf.readSize(), _buf.size());items = new java.util.ArrayList<cfg.test.TestRow>(__n0);for(int __i0 = 0 ; __i0 < __n0 ; __i0++) { cfg.test.TestRow __e0;  __e0 = cfg.test.TestRow.deserialize(_buf); items.add(__e0);}}
    }

    public static ExcelFromJsonMultiRow deserialize(ByteBuf _buf) {
            return new cfg.test.ExcelFromJsonMultiRow(_buf);
    }

    public final int id;
    public final int x;
    public final java.util.ArrayList<cfg.test.TestRow> items;

    public static final int __ID__ = 715335694;
    
    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public String toString() {
        return "{ "
        + "id:" + id + ","
        + "x:" + x + ","
        + "items:" + items + ","
        + "}";
    }
}

