
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg.ai;

import luban.*;


public final class UeForceSuccess extends cfg.ai.Decorator {
    public UeForceSuccess(ByteBuf _buf) { 
        super(_buf);
    }

    public static UeForceSuccess deserialize(ByteBuf _buf) {
            return new cfg.ai.UeForceSuccess(_buf);
    }


    public static final int __ID__ = 195054574;
    
    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public String toString() {
        return "{ "
        + "id:" + id + ","
        + "nodeName:" + nodeName + ","
        + "flowAbortMode:" + flowAbortMode + ","
        + "}";
    }
}

