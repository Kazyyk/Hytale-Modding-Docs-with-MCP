# MovementAudioComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class MovementAudioComponent implements Component<EntityStore>

An `EntityStore` component.

## Fields

- public static float NO_REPEAT
- private int lastInsideBlockTypeId
- private float nextMoveInRepeat
- protected Ref<EntityStore> owner

## Methods

- public static ComponentType<EntityStore, MovementAudioComponent> getComponentType()
- @Nonnull public MovementAudioComponent.ShouldHearPredicate getShouldHearPredicate(Ref<EntityStore> ref)
- public int getLastInsideBlockTypeId()
- public void setLastInsideBlockTypeId(int lastInsideBlockTypeId)
- public boolean canMoveInRepeat()
- public boolean tickMoveInRepeat(float dt)
- public void setNextMoveInRepeat(float nextMoveInRepeat)
- @Override public Component<EntityStore> clone()
- public boolean test(@Nonnull Ref<EntityStore> targetRef)
