# PositionDataComponent

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class PositionDataComponent implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private int insideBlockTypeId
- private int standingOnBlockTypeId

## Methods

- public static ComponentType<EntityStore, PositionDataComponent> getComponentType()
- public int getInsideBlockTypeId()
- public void setInsideBlockTypeId(int insideBlockTypeId)
- public int getStandingOnBlockTypeId()
- public void setStandingOnBlockTypeId(int standingOnBlockTypeId)
- @Override public Component<EntityStore> clone()
