
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg.test;

import luban.*;


public final class TestUeType extends AbstractBean {
    public TestUeType(ByteBuf _buf) { 
        x1 = _buf.readBool();
        x2 = _buf.readByte();
        x3 = _buf.readShort();
        x4 = _buf.readInt();
        x5 = _buf.readLong();
        x6 = _buf.readFloat();
        x10 = _buf.readString();
        x12 = cfg.test.DemoType1.deserialize(_buf);
        x13 = _buf.readInt();
        t1 = _buf.readLong();
        {int __n0 = Math.min(_buf.readSize(), _buf.size());k1 = new int[__n0];for(int __i0 = 0 ; __i0 < __n0 ; __i0++) { int __e0;__e0 = _buf.readInt(); k1[__i0] = __e0;}}
        {int __n0 = Math.min(_buf.readSize(), _buf.size());k2 = new java.util.ArrayList<Integer>(__n0);for(int __i0 = 0 ; __i0 < __n0 ; __i0++) { Integer __e0;  __e0 = _buf.readInt(); k2.add(__e0);}}
        {int __n0 = Math.min(_buf.readSize(), _buf.size());k5 = new java.util.HashSet<Integer>(__n0 * 3 / 2);for(int __i0 = 0 ; __i0 < __n0 ; __i0++) { Integer __e0;  __e0 = _buf.readInt(); k5.add(__e0);}}
        {int __n0 = Math.min(_buf.readSize(), _buf.size());k8 = new java.util.HashMap<Integer, Integer>(__n0 * 3 / 2);for(int __i0 = 0 ; __i0 < __n0 ; __i0++) { Integer __k0;  __k0 = _buf.readInt(); Integer __v0;  __v0 = _buf.readInt();     k8.put(__k0, __v0);}}
        {int __n0 = Math.min(_buf.readSize(), _buf.size());k9 = new java.util.ArrayList<cfg.test.DemoE2>(__n0);for(int __i0 = 0 ; __i0 < __n0 ; __i0++) { cfg.test.DemoE2 __e0;  __e0 = cfg.test.DemoE2.deserialize(_buf); k9.add(__e0);}}
    }

    public static TestUeType deserialize(ByteBuf _buf) {
            return new cfg.test.TestUeType(_buf);
    }

    public final boolean x1;
    public final byte x2;
    public final short x3;
    public final int x4;
    public final long x5;
    public final float x6;
    public final String x10;
    public final cfg.test.DemoType1 x12;
    public final int x13;
    public final long t1;
    public final int[] k1;
    public final java.util.ArrayList<Integer> k2;
    public final java.util.HashSet<Integer> k5;
    public final java.util.HashMap<Integer, Integer> k8;
    public final java.util.ArrayList<cfg.test.DemoE2> k9;

    public static final int __ID__ = 381013016;
    
    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public String toString() {
        return "{ "
        + "x1:" + x1 + ","
        + "x2:" + x2 + ","
        + "x3:" + x3 + ","
        + "x4:" + x4 + ","
        + "x5:" + x5 + ","
        + "x6:" + x6 + ","
        + "x10:" + x10 + ","
        + "x12:" + x12 + ","
        + "x13:" + x13 + ","
        + "t1:" + t1 + ","
        + "k1:" + k1 + ","
        + "k2:" + k2 + ","
        + "k5:" + k5 + ","
        + "k8:" + k8 + ","
        + "k9:" + k9 + ","
        + "}";
    }
}
