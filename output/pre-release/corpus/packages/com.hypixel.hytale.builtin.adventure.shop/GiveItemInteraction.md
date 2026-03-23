# GiveItemInteraction

Type: class | Package: com.hypixel.hytale.builtin.adventure.shop | Extends: ChoiceInteraction

public class GiveItemInteraction extends ChoiceInteraction

Interaction handler extending `ChoiceInteraction`.

## Fields

- itemId | String | String field.
- quantity | int | int field.

## Constructors

- GiveItemInteraction(String itemId, int quantity) | Creates a new GiveItemInteraction instance.
- GiveItemInteraction() | Creates a new GiveItemInteraction instance.

## Methods

- getItemId() | String | public method.
- getQuantity() | int | public method.
- run(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef) | void | public method.
- toString() | String | public method.

Also in this package: ShopAsset, ShopElement, ShopPage, ShopPageSupplier, ShopPlugin

Complete API:
  public String getItemId()
  public int getQuantity()
  public void run(Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef)
  public String toString()

Fields:
public static final BuilderCodec<GiveItemInteraction> CODEC
protected String itemId
protected int quantity
