# BuilderToolData

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config | Implements: NetworkSerializable<ItemBuilderToolData>

public class BuilderToolData implements NetworkSerializable<ItemBuilderToolData>

Holds the UI identifiers and array of BuilderTool instances associated with an item. Serialized as part of item configuration data.

## Methods

- public String[] getUi()
- public BuilderTool[] getTools()
- public ItemBuilderToolData toPacket()

Also in this package: ArgData, BlockTypeListAsset, BrushData, BuilderTool, PrefabListAsset, PrefabReference, PrefabRootDirectory, Values

Complete API:
  public String[] getUi()
  public BuilderTool[] getTools()
  public ItemBuilderToolData toPacket()
  public String toString()

Fields:
public static final BuilderToolData DEFAULT
public static final BuilderCodec<BuilderToolData> CODEC
protected String[] ui
protected BuilderTool[] tools
