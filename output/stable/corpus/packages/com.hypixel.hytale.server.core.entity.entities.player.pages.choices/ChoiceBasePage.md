# ChoiceBasePage

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.pages.choices | Extends: InteractiveCustomUIPage<ChoiceBasePage.ChoicePageEventData>

public abstract class ChoiceBasePage extends InteractiveCustomUIPage<ChoiceBasePage.ChoicePageEventData>

Class in the choices subsystem.

## Fields

- elements | ChoiceElement[] | final ChoiceElement[] field.
- pageLayout | String | final String field.

## Constructors

- ChoiceBasePage(@Nonnull PlayerRef playerRef, ChoiceElement[] elements, String pageLayout) | Creates a new ChoiceBasePage instance.

## Methods

- getElements() | ChoiceElement[] | protected method.
- getPageLayout() | String | protected method.
- handleDataEvent(@Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull ChoiceBasePage.ChoicePageEventData data) | void | public method.

Known subclasses: ItemRepairPage, ShopPage

Also in this package: ChoiceElement, ChoiceInteraction, ChoicePageEventData, ChoiceRequirement

Complete API:
  protected ChoiceElement[] getElements()
  protected String getPageLayout()
  public void build(Ref<EntityStore> ref, UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, Store<EntityStore> store)
  public void handleDataEvent(Ref<EntityStore> ref, Store<EntityStore> store, ChoiceBasePage.ChoicePageEventData data)

Fields:
private final ChoiceElement[] elements
private final String pageLayout
