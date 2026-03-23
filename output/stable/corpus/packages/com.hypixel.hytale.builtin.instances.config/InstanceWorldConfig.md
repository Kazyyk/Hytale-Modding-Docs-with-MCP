# InstanceWorldConfig

Type: class | Package: com.hypixel.hytale.builtin.instances.config

public class InstanceWorldConfig

## Fields

- @Nonnull public static final String ID
- @Nonnull public static final BuilderCodec<InstanceWorldConfig> CODEC
- @Nonnull private RemovalCondition[] removalConditions
- @Nullable private WorldReturnPoint returnPoint
- private boolean preventReconnection
- @Nullable private InstanceDiscoveryConfig discovery

## Methods

- @Nullable public static InstanceWorldConfig get(@Nonnull WorldConfig config)
- @Nonnull public static InstanceWorldConfig ensureAndGet(@Nonnull WorldConfig config)
- public boolean shouldPreventReconnection()
- @Nonnull public RemovalCondition[] getRemovalConditions()
- public void setRemovalConditions(@Nonnull RemovalCondition... removalConditions)
- @Nullable public WorldReturnPoint getReturnPoint()
- public void setReturnPoint(@Nullable WorldReturnPoint returnPoint)
- @Nullable public InstanceDiscoveryConfig getDiscovery()
- public void setDiscovery(@Nullable InstanceDiscoveryConfig discovery)

Also in this package: ExitInstance, InstanceDiscoveryConfig, InstanceEntityConfig, WorldReturnPoint

Complete API:
  public static InstanceWorldConfig get(WorldConfig config)
  public static InstanceWorldConfig ensureAndGet(WorldConfig config)
  public boolean shouldPreventReconnection()
  public RemovalCondition[] getRemovalConditions()
  public void setRemovalConditions(RemovalCondition removalConditions)
  public WorldReturnPoint getReturnPoint()
  public void setReturnPoint(WorldReturnPoint returnPoint)
  public InstanceDiscoveryConfig getDiscovery()
  public void setDiscovery(InstanceDiscoveryConfig discovery)

Fields:
public static final String ID
public static final BuilderCodec<InstanceWorldConfig> CODEC
private RemovalCondition[] removalConditions
private WorldReturnPoint returnPoint
private boolean preventReconnection
private InstanceDiscoveryConfig discovery
