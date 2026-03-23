# DynamicLight

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class DynamicLight implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private ColorLight colorLight
- private boolean isNetworkOutdated

## Methods

- public static ComponentType<EntityStore, DynamicLight> getComponentType()
- public ColorLight getColorLight()
- public void setColorLight(ColorLight colorLight)
- public boolean consumeNetworkOutdated()
- @Override public Component<EntityStore> clone()
