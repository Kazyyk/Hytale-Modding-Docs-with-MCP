# ResourceChange

Type: class | Package: com.hypixel.hytale.component.data.change | Implements: DataChange

public class ResourceChange<ECS_TYPE, T> implements DataChange

## Fields

- private final ChangeType type
- private final ResourceType<ECS_TYPE,T> resourceType

## Methods

- public ChangeType getType()
- public ResourceType<ECS_TYPE,T> getResourceType()
- @Nonnull @Override public String toString()

Also in this package: ChangeType, ComponentChange, DataChange, SystemChange, SystemGroupChange, SystemTypeChange

Complete API:
  public ChangeType getType()
  public ResourceType<ECS_TYPE,T> getResourceType()
  public String toString()

Fields:
private final ChangeType type
private final ResourceType<ECS_TYPE,T> resourceType
