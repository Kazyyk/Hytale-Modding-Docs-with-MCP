# EmptyItemDropContainer

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config.container | Extends: ItemDropContainer

public class EmptyItemDropContainer extends ItemDropContainer

Drop container that produces no drops. Used as a default/null container.

Also in this package: ChoiceItemDropContainer, DroplistItemDropContainer, ItemDropContainer, MultipleItemDropContainer, SingleItemDropContainer

Complete API:
  protected void populateDrops(List<ItemDrop> drops, DoubleSupplier chanceProvider, Set<String> droplistReferences)
  public List<ItemDrop> getAllDrops(List<ItemDrop> list)
  public String toString()

Fields:
public static final BuilderCodec<EmptyItemDropContainer> CODEC
