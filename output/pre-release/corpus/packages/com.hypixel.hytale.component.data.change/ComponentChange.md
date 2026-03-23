# ComponentChange

Type: class | Package: com.hypixel.hytale.component.data.change | Implements: DataChange

public class ComponentChange<ECS_TYPE, T> implements DataChange

## Fields

- private final ChangeType type
- private final ComponentType<ECS_TYPE,T> componentType

## Methods

- public ChangeType getType()
- public ComponentType<ECS_TYPE,T> getComponentType()
- @Nonnull @Override public String toString()

Also in this package: ChangeType, DataChange, ResourceChange, SystemChange, SystemGroupChange, SystemTypeChange

Complete API:
  public ChangeType getType()
  public ComponentType<ECS_TYPE,T> getComponentType()
  public String toString()

Fields:
private final ChangeType type
private final ComponentType<ECS_TYPE,T> componentType
