# BuilderToolData

Type: class | Package: com.hypixel.hytale.server.core.asset.type.buildertool.config | Implements: NetworkSerializable<ItemBuilderToolData>

public class BuilderToolData implements NetworkSerializable<ItemBuilderToolData>

Holds the UI identifiers and array of BuilderTool instances associated with an item. Serialized as part of item configuration data.

## Methods

- public String[] getUi()
- public BuilderTool[] getTools()
- public ItemBuilderToolData toPacket()
