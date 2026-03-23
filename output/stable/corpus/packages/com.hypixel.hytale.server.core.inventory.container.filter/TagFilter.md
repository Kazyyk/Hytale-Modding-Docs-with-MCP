# TagFilter

Type: class | Package: com.hypixel.hytale.server.core.inventory.container.filter | Implements: ItemSlotFilter

public class TagFilter implements ItemSlotFilter

Slot filter that only permits items whose expanded tag indexes contain the configured tag index. Checks via `item.getData().getExpandedTagIndexes().contains(tagIndex)`.

## Constructors


public TagFilter(int tagIndex)

Creates a filter for the given tag index.

## Methods


@Override
public boolean test(@Nullable Item item)

Returns `true` if the item is `null` or its expanded tag indexes contain the configured tag index.
