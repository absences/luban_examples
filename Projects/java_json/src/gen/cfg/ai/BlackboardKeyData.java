
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


public final class BlackboardKeyData extends cfg.ai.KeyData {
    public BlackboardKeyData(JsonObject _buf) { 
        super(_buf);
        value = _buf.get("value").getAsString();
    }

    public static BlackboardKeyData deserialize(JsonObject _buf) {
            return new cfg.ai.BlackboardKeyData(_buf);
    }

    public final String value;

    public static final int __ID__ = 1517269500;
    
    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public String toString() {
        return "{ "
        + "value:" + value + ","
        + "}";
    }
}

