# CreativeHubEntityConfig

Type: class | Package: com.hypixel.hytale.builtin.creativehub.config | Implements: Component

public class CreativeHubEntityConfig implements Component

## Fields

- public static final String ID
- public static final BuilderCodec<CreativeHubEntityConfig> CODEC
- private UUID parentHubWorldUuid

## Methods

- @Nonnull public static ComponentType<EntityStore,CreativeHubEntityConfig> getComponentType()
- @Nonnull public static CreativeHubEntityConfig ensureAndGet(Holder<EntityStore> holder)
- @Nullable public static CreativeHubEntityConfig get(Holder<EntityStore> holder)
- @Nullable public UUID getParentHubWorldUuid()
- public void setParentHubWorldUuid(UUID parentHubWorldUuid)
- @Nonnull public CreativeHubEntityConfig clone()

Also in this package: CreativeHubWorldConfig

Complete API:
  public static ComponentType<EntityStore,CreativeHubEntityConfig> getComponentType()
  public static CreativeHubEntityConfig ensureAndGet(Holder<EntityStore> holder)
  public static CreativeHubEntityConfig get(Holder<EntityStore> holder)
  public UUID getParentHubWorldUuid()
  public void setParentHubWorldUuid(UUID parentHubWorldUuid)
  public CreativeHubEntityConfig clone()

Fields:
public static final String ID
public static final BuilderCodec<CreativeHubEntityConfig> CODEC
private UUID parentHubWorldUuid
