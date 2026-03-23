# DiscoverZoneEvent

Type: class | Package: com.hypixel.hytale.server.core.event.events.ecs | Extends: EcsEvent

public abstract class DiscoverZoneEvent extends EcsEvent

Abstract base class extending `EcsEvent` that provides shared logic for DiscoverZoneEvent subclasses.

## Fields

- @Nonnull private final WorldMapTracker.ZoneDiscoveryInfo discoveryInfo

## Methods

- public DiscoverZoneEvent(@Nonnull WorldMapTracker.ZoneDiscoveryInfo discoveryInfo)
- @Nonnull public WorldMapTracker.ZoneDiscoveryInfo getDiscoveryInfo()

Known subclasses: Display

Also in this package: BreakBlockEvent, ChangeGameModeEvent, CraftRecipeEvent, DamageBlockEvent, Display, Drop, DropItemEvent, InteractivelyPickupItemEvent, PlaceBlockEvent, PlayerRequest, Post, Post, Pre, Pre, SwitchActiveSlotEvent, UseBlockEvent

Complete API:
  public WorldMapTracker.ZoneDiscoveryInfo getDiscoveryInfo()

Fields:
private final WorldMapTracker.ZoneDiscoveryInfo discoveryInfo
