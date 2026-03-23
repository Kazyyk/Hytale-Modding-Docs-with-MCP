# SingleItemDropContainer

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config.container | Extends: ItemDropContainer

public class SingleItemDropContainer extends ItemDropContainer

Drop container producing a single `ItemDrop`. The simplest container type, wrapping one item drop definition.

## Fields

- drop | ItemDrop | The item drop to produce.

Also in this package: ChoiceItemDropContainer, DroplistItemDropContainer, EmptyItemDropContainer, ItemDropContainer, MultipleItemDropContainer

Complete API:
  public ItemDrop getDrop()
  protected void populateDrops(List<ItemDrop> drops, DoubleSupplier chanceProvider, Set<String> droplistReferences)
  public List<ItemDrop> getAllDrops(List<ItemDrop> list)
  public String toString()

Fields:
public static final BuilderCodec<SingleItemDropContainer> CODEC
protected ItemDrop drop
