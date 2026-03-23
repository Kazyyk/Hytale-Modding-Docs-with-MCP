# DroplistItemDropContainer

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config.container | Extends: ItemDropContainer

public class DroplistItemDropContainer extends ItemDropContainer

Drop container that delegates to a named `ItemDropList` asset by ID. Tracks visited droplists to prevent circular references.

## Fields

- droplistId | String | ID of the referenced ItemDropList asset.

Also in this package: ChoiceItemDropContainer, EmptyItemDropContainer, ItemDropContainer, MultipleItemDropContainer, SingleItemDropContainer

Complete API:
  protected void populateDrops(List<ItemDrop> drops, DoubleSupplier chanceProvider, Set<String> droplistReferences)
  public List<ItemDrop> getAllDrops(List<ItemDrop> list)
  public String toString()

Fields:
public static final BuilderCodec<DroplistItemDropContainer> CODEC
String droplistId
