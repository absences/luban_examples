
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg.ai;

import luban.*;


public final class IsAtLocation extends cfg.ai.Decorator {
    public IsAtLocation(ByteBuf _buf) { 
        super(_buf);
        acceptableRadius = _buf.readFloat();
        keyboardKey = _buf.readString();
        inverseCondition = _buf.readBool();
    }

    public static IsAtLocation deserialize(ByteBuf _buf) {
            return new cfg.ai.IsAtLocation(_buf);
    }

    public final float acceptableRadius;
    public final String keyboardKey;
    public final boolean inverseCondition;

    public static final int __ID__ = 1255972344;
    
    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public String toString() {
        return "{ "
        + "id:" + id + ","
        + "nodeName:" + nodeName + ","
        + "flowAbortMode:" + flowAbortMode + ","
        + "acceptableRadius:" + acceptableRadius + ","
        + "keyboardKey:" + keyboardKey + ","
        + "inverseCondition:" + inverseCondition + ","
        + "}";
    }
}

