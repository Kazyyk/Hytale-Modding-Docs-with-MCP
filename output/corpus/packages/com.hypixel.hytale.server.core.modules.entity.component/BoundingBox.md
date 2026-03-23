# BoundingBox

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class BoundingBox implements Component<EntityStore>

An `EntityStore` component.

## Fields

- protected Map<String, DetailBox[]> detailBoxes

## Methods

- public static ComponentType<EntityStore, BoundingBox> getComponentType()
- @Nonnull public Box getBoundingBox()
- public void setBoundingBox(@Nonnull Box boundingBox)
- public Map<String, DetailBox[]> getDetailBoxes()
- public void setDetailBoxes(Map<String, DetailBox[]> detailBoxes)
- @Override public Component<EntityStore> clone()
