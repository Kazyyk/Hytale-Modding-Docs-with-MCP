# ItemDropContainer

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config.container | Implements: IWeightedElement

public abstract class ItemDropContainer implements IWeightedElement

Abstract base for all item drop containers. Provides weighted selection support and the `populateDrops` API for generating item drops. Defines the polymorphic `CODEC` (`CodecMapCodec`) used to deserialize container subtypes by `"Type"` key.

## Fields

- weight | double | Selection weight (default 100.0).
- CODEC | CodecMapCodec<ItemDropContainer> | Polymorphic codec dispatching by "Type" key.
- EMPTY_ARRAY | ItemDropContainer[] | Empty container array constant.
