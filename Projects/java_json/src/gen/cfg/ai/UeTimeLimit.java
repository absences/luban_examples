
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg.ai;

import luban.*;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;


public final class UeTimeLimit extends cfg.ai.Decorator {
    public UeTimeLimit(JsonObject _buf) { 
        super(_buf);
        limitTime = _buf.get("limit_time").getAsFloat();
    }

    public static UeTimeLimit deserialize(JsonObject _buf) {
            return new cfg.ai.UeTimeLimit(_buf);
    }

    public final float limitTime;

    public static final int __ID__ = 338469720;
    
    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public String toString() {
        return "{ "
        + "id:" + id + ","
        + "nodeName:" + nodeName + ","
        + "flowAbortMode:" + flowAbortMode + ","
        + "limitTime:" + limitTime + ","
        + "}";
    }
}

