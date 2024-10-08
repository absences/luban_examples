
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


public abstract class Service extends cfg.ai.Node {
    public Service(JsonObject _buf) { 
        super(_buf);
    }

    public static Service deserialize(JsonObject _buf) {
        switch (_buf.get("$type").getAsString()) {
            case "UeSetDefaultFocus": return new cfg.ai.UeSetDefaultFocus(_buf);
            case "ExecuteTimeStatistic": return new cfg.ai.ExecuteTimeStatistic(_buf);
            case "ChooseTarget": return new cfg.ai.ChooseTarget(_buf);
            case "KeepFaceTarget": return new cfg.ai.KeepFaceTarget(_buf);
            case "GetOwnerPlayer": return new cfg.ai.GetOwnerPlayer(_buf);
            case "UpdateDailyBehaviorProps": return new cfg.ai.UpdateDailyBehaviorProps(_buf);
            default: throw new SerializationException();
        }
    }



    @Override
    public String toString() {
        return "{ "
        + "id:" + id + ","
        + "nodeName:" + nodeName + ","
        + "}";
    }
}

