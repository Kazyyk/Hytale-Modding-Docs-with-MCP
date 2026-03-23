# ChoiceInteraction

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player.pages.choices

public abstract class ChoiceInteraction

Block or entity interaction handler.

## Constructors

- ChoiceInteraction() | Creates a new ChoiceInteraction instance.

## Methods

- run(@Nonnull Store<EntityStore> var1, @Nonnull Ref<EntityStore> var2, @Nonnull PlayerRef var3) | void | public method.
- toString() | String | public method.

Known subclasses: GiveItemInteraction, RepairItemInteraction, StartObjectiveInteraction

Also in this package: ChoiceBasePage, ChoiceElement, ChoicePageEventData, ChoiceRequirement

Complete API:
  public abstract void run(Store<EntityStore> var1, Ref<EntityStore> var2, PlayerRef var3)
  public String toString()

Fields:
public static final CodecMapCodec<ChoiceInteraction> CODEC
public static final BuilderCodec<ChoiceInteraction> BASE_CODEC
