# MultipleItemDropContainer

Type: class | Package: com.hypixel.hytale.server.core.asset.type.item.config.container | Extends: ItemDropContainer

public class MultipleItemDropContainer extends ItemDropContainer

Drop container producing a random count of drops from child containers. Selects between `minCount` and `maxCount` children to evaluate.

## Fields

- containers | ItemDropContainer[] | Child containers to select from.
- minCount | int | Minimum number of children to evaluate (default 1).
- maxCount | int | Maximum number of children to evaluate (default 1).
