# ActiveAnimationComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class ActiveAnimationComponent implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private boolean isNetworkOutdated

## Methods

- public static ComponentType<EntityStore, ActiveAnimationComponent> getComponentType()
- public String[] getActiveAnimations()
- public void setPlayingAnimation(AnimationSlot slot, @Nullable String animation)
- public boolean consumeNetworkOutdated()
- @Override public Component<EntityStore> clone()
