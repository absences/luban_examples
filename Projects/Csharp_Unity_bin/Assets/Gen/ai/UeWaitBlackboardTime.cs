
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

using Luban;


namespace cfg.ai
{
public sealed partial class UeWaitBlackboardTime : ai.Task
{
    public UeWaitBlackboardTime(ByteBuf _buf)  : base(_buf) 
    {
        BlackboardKey = _buf.ReadString();
    }

    public static UeWaitBlackboardTime DeserializeUeWaitBlackboardTime(ByteBuf _buf)
    {
        return new ai.UeWaitBlackboardTime(_buf);
    }

    public readonly string BlackboardKey;
   
    public const int __ID__ = 1215378271;
    public override int GetTypeId() => __ID__;

    public override void ResolveRef(Tables tables)
    {
        base.ResolveRef(tables);
    }

    public override string ToString()
    {
        return "{ "
        + "id:" + Id + ","
        + "nodeName:" + NodeName + ","
        + "decorators:" + Luban.StringUtil.CollectionToString(Decorators) + ","
        + "services:" + Luban.StringUtil.CollectionToString(Services) + ","
        + "ignoreRestartSelf:" + IgnoreRestartSelf + ","
        + "blackboardKey:" + BlackboardKey + ","
        + "}";
    }
}

}

