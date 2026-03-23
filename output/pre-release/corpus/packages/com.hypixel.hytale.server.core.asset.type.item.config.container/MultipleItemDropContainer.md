# MultipleItemDropContainer

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config.container | Extends: ItemDropContainer

public class MultipleItemDropContainer extends ItemDropContainer

Drop container producing a random count of drops from child containers. Selects between `minCount` and `maxCount` children to evaluate.

## Fields

- containers | ItemDropContainer[] | Child containers to select from.
- minCount | int | Minimum number of children to evaluate (default 1).
- maxCount | int | Maximum number of children to evaluate (default 1).

Also in this package: ChoiceItemDropContainer, DroplistItemDropContainer, EmptyItemDropContainer, ItemDropContainer, SingleItemDropContainer

Complete API:
  protected void populateDrops(List<ItemDrop> drops, DoubleSupplier chanceProvider, Set<String> droplistReferences)
  public List<ItemDrop> getAllDrops(List<ItemDrop> list)
  public String toString()

Fields:
public static final BuilderCodec<MultipleItemDropContainer> CODEC
protected ItemDropContainer[] containers
protected int minCount
protected int maxCount
