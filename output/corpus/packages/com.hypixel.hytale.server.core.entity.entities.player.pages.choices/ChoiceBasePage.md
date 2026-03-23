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
