# FetchedItemContainer

Type: class | Package: com.hypixel.hytale.server.core.inventory.container | Extends: ItemContainer

public class FetchedItemContainer extends ItemContainer

Item container proxy that lazily fetches its delegate via a `Supplier<ItemContainer>`. All operations are forwarded to the fetched container at call time. Used by `InventoryComponent.getCombined()` to wrap inventory components that may be swapped out during the entity lifecycle.

## Constructors

- public FetchedItemContainer(Supplier<ItemContainer> fetcher)

## Methods

All `ItemContainer` methods are delegated to the supplier-fetched container instance.

## Relationships

- Extends `ItemContainer`
- Created by InventoryComponent when building combined views
