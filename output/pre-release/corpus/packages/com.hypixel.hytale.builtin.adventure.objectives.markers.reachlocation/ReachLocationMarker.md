# ReachLocationMarker

Type: class | Package: com.hypixel.hytale.builtin.adventure.objectives.markers.reachlocation | Implements: Component

public class ReachLocationMarker implements Component<EntityStore>

An `EntityStore` component.

## Fields

- private String markerId

## Methods

- public static ComponentType<EntityStore, ReachLocationMarker> getComponentType()
- public String getMarkerId()
- @Nullable public String getLocationName()
- @Nonnull public Set<UUID> getPlayers()
- @Override public Component<EntityStore> clone()

Also in this package: EnsureNetworkSendable, EntityAdded, ReachLocationMarkerAsset, ReachLocationMarkerSystems, Ticking

Complete API:
  public static ComponentType<EntityStore,ReachLocationMarker> getComponentType()
  public String getMarkerId()
  public String getLocationName()
  public Set<UUID> getPlayers()
  public Component<EntityStore> clone()

Fields:
public static final BuilderCodec<ReachLocationMarker> CODEC
private String markerId
private final Set<UUID> players
