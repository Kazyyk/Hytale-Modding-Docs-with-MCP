# SystemChange

Type: class | Package: com.hypixel.hytale.component.data.change | Implements: DataChange

public class SystemChange<ECS_TYPE> implements DataChange

## Fields

- private final ChangeType type
- private final ISystem<ECS_TYPE> system

## Methods

- public ChangeType getType()
- public ISystem<ECS_TYPE> getSystem()
- @Nonnull @Override public String toString()

Also in this package: ChangeType, ComponentChange, DataChange, ResourceChange, SystemGroupChange, SystemTypeChange

Complete API:
  public ChangeType getType()
  public ISystem<ECS_TYPE> getSystem()
  public String toString()

Fields:
private final ChangeType type
private final ISystem<ECS_TYPE> system
