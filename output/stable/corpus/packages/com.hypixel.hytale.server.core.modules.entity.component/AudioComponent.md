# AudioComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class AudioComponent implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private IntList soundEventIds
- private boolean isNetworkOutdated

## Methods

- public static ComponentType<EntityStore, AudioComponent> getComponentType()
- public int[] getSoundEventIds()
- public void addSound(int soundIndex)
- public boolean consumeNetworkOutdated()
- @Override public Component<EntityStore> clone()
