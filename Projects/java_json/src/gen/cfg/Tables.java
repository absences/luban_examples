
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg;

import luban.*;
import com.google.gson.JsonElement;

public final class Tables
{

    public  interface  IJsonLoader {
        JsonElement load(String file) throws java.io.IOException;
    }

    private final cfg.ai.TbBlackboard _tbblackboard;
    public cfg.ai.TbBlackboard getTbBlackboard() { return _tbblackboard; }
    private final cfg.ai.TbBehaviorTree _tbbehaviortree;
    public cfg.ai.TbBehaviorTree getTbBehaviorTree() { return _tbbehaviortree; }
    private final cfg.common.TbGlobalConfig _tbglobalconfig;
    public cfg.common.TbGlobalConfig getTbGlobalConfig() { return _tbglobalconfig; }
    /**
     * 道具表
     */
    private final cfg.item.TbItem _tbitem;
    public cfg.item.TbItem getTbItem() { return _tbitem; }
    private final cfg.l10n.TbL10NDemo _tbl10ndemo;
    public cfg.l10n.TbL10NDemo getTbL10NDemo() { return _tbl10ndemo; }
    private final cfg.l10n.TbPatchDemo _tbpatchdemo;
    public cfg.l10n.TbPatchDemo getTbPatchDemo() { return _tbpatchdemo; }
    private final cfg.tag.TbTestTag _tbtesttag;
    public cfg.tag.TbTestTag getTbTestTag() { return _tbtesttag; }
    private final cfg.test.TbFullTypes _tbfulltypes;
    public cfg.test.TbFullTypes getTbFullTypes() { return _tbfulltypes; }
    private final cfg.test.TbSingleton _tbsingleton;
    public cfg.test.TbSingleton getTbSingleton() { return _tbsingleton; }
    private final cfg.test.TbNotIndexList _tbnotindexlist;
    public cfg.test.TbNotIndexList getTbNotIndexList() { return _tbnotindexlist; }
    private final cfg.test.TbMultiUnionIndexList _tbmultiunionindexlist;
    public cfg.test.TbMultiUnionIndexList getTbMultiUnionIndexList() { return _tbmultiunionindexlist; }
    private final cfg.test.TbMultiIndexList _tbmultiindexlist;
    public cfg.test.TbMultiIndexList getTbMultiIndexList() { return _tbmultiindexlist; }
    private final cfg.test.TbDataFromMisc _tbdatafrommisc;
    public cfg.test.TbDataFromMisc getTbDataFromMisc() { return _tbdatafrommisc; }
    private final cfg.test.TbMultiRowRecord _tbmultirowrecord;
    public cfg.test.TbMultiRowRecord getTbMultiRowRecord() { return _tbmultirowrecord; }
    private final cfg.test.TbTestMultiColumn _tbtestmulticolumn;
    public cfg.test.TbTestMultiColumn getTbTestMultiColumn() { return _tbtestmulticolumn; }
    private final cfg.test.TbMultiRowTitle _tbmultirowtitle;
    public cfg.test.TbMultiRowTitle getTbMultiRowTitle() { return _tbmultirowtitle; }
    private final cfg.test.TbTestNull _tbtestnull;
    public cfg.test.TbTestNull getTbTestNull() { return _tbtestnull; }
    private final cfg.test.TbDemoPrimitive _tbdemoprimitive;
    public cfg.test.TbDemoPrimitive getTbDemoPrimitive() { return _tbdemoprimitive; }
    private final cfg.test.TbTestString _tbteststring;
    public cfg.test.TbTestString getTbTestString() { return _tbteststring; }
    private final cfg.test.TbDemoGroup _tbdemogroup;
    public cfg.test.TbDemoGroup getTbDemoGroup() { return _tbdemogroup; }
    private final cfg.test.TbDemoGroup_C _tbdemogroup_c;
    public cfg.test.TbDemoGroup_C getTbDemoGroup_C() { return _tbdemogroup_c; }
    private final cfg.test.TbDemoGroup_S _tbdemogroup_s;
    public cfg.test.TbDemoGroup_S getTbDemoGroup_S() { return _tbdemogroup_s; }
    private final cfg.test.TbDemoGroup_E _tbdemogroup_e;
    public cfg.test.TbDemoGroup_E getTbDemoGroup_E() { return _tbdemogroup_e; }
    private final cfg.test.TbTestGlobal _tbtestglobal;
    public cfg.test.TbTestGlobal getTbTestGlobal() { return _tbtestglobal; }
    private final cfg.test.TbTestBeRef _tbtestberef;
    public cfg.test.TbTestBeRef getTbTestBeRef() { return _tbtestberef; }
    private final cfg.test.TbTestBeRef2 _tbtestberef2;
    public cfg.test.TbTestBeRef2 getTbTestBeRef2() { return _tbtestberef2; }
    private final cfg.test.TbTestRef _tbtestref;
    public cfg.test.TbTestRef getTbTestRef() { return _tbtestref; }
    private final cfg.test.TbTestSize _tbtestsize;
    public cfg.test.TbTestSize getTbTestSize() { return _tbtestsize; }
    private final cfg.test.TbTestSet _tbtestset;
    public cfg.test.TbTestSet getTbTestSet() { return _tbtestset; }
    private final cfg.test.TbDetectCsvEncoding _tbdetectcsvencoding;
    public cfg.test.TbDetectCsvEncoding getTbDetectCsvEncoding() { return _tbdetectcsvencoding; }
    private final cfg.test.TbItem2 _tbitem2;
    public cfg.test.TbItem2 getTbItem2() { return _tbitem2; }
    private final cfg.test.TbTestIndex _tbtestindex;
    public cfg.test.TbTestIndex getTbTestIndex() { return _tbtestindex; }
    private final cfg.test.TbTestMap _tbtestmap;
    public cfg.test.TbTestMap getTbTestMap() { return _tbtestmap; }
    private final cfg.test.TbExcelFromJson _tbexcelfromjson;
    public cfg.test.TbExcelFromJson getTbExcelFromJson() { return _tbexcelfromjson; }
    private final cfg.test.TbCompositeJsonTable1 _tbcompositejsontable1;
    public cfg.test.TbCompositeJsonTable1 getTbCompositeJsonTable1() { return _tbcompositejsontable1; }
    private final cfg.test.TbCompositeJsonTable2 _tbcompositejsontable2;
    public cfg.test.TbCompositeJsonTable2 getTbCompositeJsonTable2() { return _tbcompositejsontable2; }
    private final cfg.test.TbCompositeJsonTable3 _tbcompositejsontable3;
    public cfg.test.TbCompositeJsonTable3 getTbCompositeJsonTable3() { return _tbcompositejsontable3; }
    private final cfg.test.TbExcelFromJsonMultiRow _tbexcelfromjsonmultirow;
    public cfg.test.TbExcelFromJsonMultiRow getTbExcelFromJsonMultiRow() { return _tbexcelfromjsonmultirow; }
    private final cfg.test.TbTestScriptableObject _tbtestscriptableobject;
    public cfg.test.TbTestScriptableObject getTbTestScriptableObject() { return _tbtestscriptableobject; }
    private final cfg.test.TbPath _tbpath;
    public cfg.test.TbPath getTbPath() { return _tbpath; }
    private final cfg.test.TbTestMapper _tbtestmapper;
    public cfg.test.TbTestMapper getTbTestMapper() { return _tbtestmapper; }
    private final cfg.test.TbDefineFromExcel2 _tbdefinefromexcel2;
    public cfg.test.TbDefineFromExcel2 getTbDefineFromExcel2() { return _tbdefinefromexcel2; }
    private final cfg.TbAutoImport1 _tbautoimport1;
    public cfg.TbAutoImport1 getTbAutoImport1() { return _tbautoimport1; }
    private final cfg.test.TbAutoImport2 _tbautoimport2;
    public cfg.test.TbAutoImport2 getTbAutoImport2() { return _tbautoimport2; }

    public Tables(IJsonLoader loader) throws java.io.IOException {
        _tbblackboard = new cfg.ai.TbBlackboard(loader.load("ai_tbblackboard")); 
        _tbbehaviortree = new cfg.ai.TbBehaviorTree(loader.load("ai_tbbehaviortree")); 
        _tbglobalconfig = new cfg.common.TbGlobalConfig(loader.load("common_tbglobalconfig")); 
        _tbitem = new cfg.item.TbItem(loader.load("item_tbitem")); 
        _tbl10ndemo = new cfg.l10n.TbL10NDemo(loader.load("l10n_tbl10ndemo")); 
        _tbpatchdemo = new cfg.l10n.TbPatchDemo(loader.load("l10n_tbpatchdemo")); 
        _tbtesttag = new cfg.tag.TbTestTag(loader.load("tag_tbtesttag")); 
        _tbfulltypes = new cfg.test.TbFullTypes(loader.load("test_tbfulltypes")); 
        _tbsingleton = new cfg.test.TbSingleton(loader.load("test_tbsingleton")); 
        _tbnotindexlist = new cfg.test.TbNotIndexList(loader.load("test_tbnotindexlist")); 
        _tbmultiunionindexlist = new cfg.test.TbMultiUnionIndexList(loader.load("test_tbmultiunionindexlist")); 
        _tbmultiindexlist = new cfg.test.TbMultiIndexList(loader.load("test_tbmultiindexlist")); 
        _tbdatafrommisc = new cfg.test.TbDataFromMisc(loader.load("test_tbdatafrommisc")); 
        _tbmultirowrecord = new cfg.test.TbMultiRowRecord(loader.load("test_tbmultirowrecord")); 
        _tbtestmulticolumn = new cfg.test.TbTestMultiColumn(loader.load("test_tbtestmulticolumn")); 
        _tbmultirowtitle = new cfg.test.TbMultiRowTitle(loader.load("test_tbmultirowtitle")); 
        _tbtestnull = new cfg.test.TbTestNull(loader.load("test_tbtestnull")); 
        _tbdemoprimitive = new cfg.test.TbDemoPrimitive(loader.load("test_tbdemoprimitive")); 
        _tbteststring = new cfg.test.TbTestString(loader.load("test_tbteststring")); 
        _tbdemogroup = new cfg.test.TbDemoGroup(loader.load("test_tbdemogroup")); 
        _tbdemogroup_c = new cfg.test.TbDemoGroup_C(loader.load("test_tbdemogroup_c")); 
        _tbdemogroup_s = new cfg.test.TbDemoGroup_S(loader.load("test_tbdemogroup_s")); 
        _tbdemogroup_e = new cfg.test.TbDemoGroup_E(loader.load("test_tbdemogroup_e")); 
        _tbtestglobal = new cfg.test.TbTestGlobal(loader.load("test_tbtestglobal")); 
        _tbtestberef = new cfg.test.TbTestBeRef(loader.load("test_tbtestberef")); 
        _tbtestberef2 = new cfg.test.TbTestBeRef2(loader.load("test_tbtestberef2")); 
        _tbtestref = new cfg.test.TbTestRef(loader.load("test_tbtestref")); 
        _tbtestsize = new cfg.test.TbTestSize(loader.load("test_tbtestsize")); 
        _tbtestset = new cfg.test.TbTestSet(loader.load("test_tbtestset")); 
        _tbdetectcsvencoding = new cfg.test.TbDetectCsvEncoding(loader.load("test_tbdetectcsvencoding")); 
        _tbitem2 = new cfg.test.TbItem2(loader.load("test_tbitem2")); 
        _tbtestindex = new cfg.test.TbTestIndex(loader.load("test_tbtestindex")); 
        _tbtestmap = new cfg.test.TbTestMap(loader.load("test_tbtestmap")); 
        _tbexcelfromjson = new cfg.test.TbExcelFromJson(loader.load("test_tbexcelfromjson")); 
        _tbcompositejsontable1 = new cfg.test.TbCompositeJsonTable1(loader.load("test_tbcompositejsontable1")); 
        _tbcompositejsontable2 = new cfg.test.TbCompositeJsonTable2(loader.load("test_tbcompositejsontable2")); 
        _tbcompositejsontable3 = new cfg.test.TbCompositeJsonTable3(loader.load("test_tbcompositejsontable3")); 
        _tbexcelfromjsonmultirow = new cfg.test.TbExcelFromJsonMultiRow(loader.load("test_tbexcelfromjsonmultirow")); 
        _tbtestscriptableobject = new cfg.test.TbTestScriptableObject(loader.load("test_tbtestscriptableobject")); 
        _tbpath = new cfg.test.TbPath(loader.load("test_tbpath")); 
        _tbtestmapper = new cfg.test.TbTestMapper(loader.load("test_tbtestmapper")); 
        _tbdefinefromexcel2 = new cfg.test.TbDefineFromExcel2(loader.load("test_tbdefinefromexcel2")); 
        _tbautoimport1 = new cfg.TbAutoImport1(loader.load("tbautoimport1")); 
        _tbautoimport2 = new cfg.test.TbAutoImport2(loader.load("test_tbautoimport2")); 
    }
}

