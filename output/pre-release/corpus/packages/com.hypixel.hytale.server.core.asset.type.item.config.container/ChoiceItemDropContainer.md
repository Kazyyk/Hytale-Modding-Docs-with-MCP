# ChoiceItemDropContainer

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config.container | Extends: ItemDropContainer

public class ChoiceItemDropContainer extends ItemDropContainer

Drop container that randomly selects from weighted child containers. Supports multiple rolls per evaluation via `rollsMin`/`rollsMax`.

## Fields

- containers | IWeightedMap<ItemDropContainer> | Weighted map of child containers.
- rollsMin | int | Minimum rolls (default 1).
- rollsMax | int | Maximum rolls (default 1).

Also in this package: DroplistItemDropContainer, EmptyItemDropContainer, ItemDropContainer, MultipleItemDropContainer, SingleItemDropContainer

Complete API:
  protected void populateDrops(List<ItemDrop> drops, DoubleSupplier chanceProvider, Set<String> droplistReferences)
  public List<ItemDrop> getAllDrops(List<ItemDrop> list)
  public String toString()

Fields:
public static final BuilderCodec<ChoiceItemDropContainer> CODEC
protected IWeightedMap<ItemDropContainer> containers
protected int rollsMin
protected int rollsMax
