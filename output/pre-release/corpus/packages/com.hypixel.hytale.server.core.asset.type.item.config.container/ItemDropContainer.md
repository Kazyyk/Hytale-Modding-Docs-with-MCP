# ItemDropContainer

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config.container | Implements: IWeightedElement

public abstract class ItemDropContainer implements IWeightedElement

Abstract base for all item drop containers. Provides weighted selection support and the `populateDrops` API for generating item drops. Defines the polymorphic `CODEC` (`CodecMapCodec`) used to deserialize container subtypes by `"Type"` key.

## Fields

- weight | double | Selection weight (default 100.0).
- CODEC | CodecMapCodec<ItemDropContainer> | Polymorphic codec dispatching by "Type" key.
- EMPTY_ARRAY | ItemDropContainer[] | Empty container array constant.

Known subclasses: ChoiceItemDropContainer, DroplistItemDropContainer, EmptyItemDropContainer, MultipleItemDropContainer, SingleItemDropContainer

Also in this package: ChoiceItemDropContainer, DroplistItemDropContainer, EmptyItemDropContainer, MultipleItemDropContainer, SingleItemDropContainer

Complete API:
  public double getWeight()
  public void populateDrops(List<ItemDrop> drops, DoubleSupplier chanceProvider, String droplistId)
  protected abstract void populateDrops(List<ItemDrop> var1, DoubleSupplier var2, Set<String> var3)
  public abstract List<ItemDrop> getAllDrops(List<ItemDrop> var1)

Fields:
public static final BuilderCodec<ItemDropContainer> DEFAULT_CODEC
public static final CodecMapCodec<ItemDropContainer> CODEC
public static final ItemDropContainer[] EMPTY_ARRAY
protected double weight
