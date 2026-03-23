# EntityScaleComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class EntityScaleComponent implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private float scale
- private boolean isNetworkOutdated

## Methods

- public static ComponentType<EntityStore, EntityScaleComponent> getComponentType()
- public float getScale()
- public void setScale(float scale)
- public boolean consumeNetworkOutdated()
- @Override public Component<EntityStore> clone()
