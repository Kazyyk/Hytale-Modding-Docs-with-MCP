# PortalDeviceSummonPage

Type: class | Package: com.hypixel.hytale.builtin.portals.ui | Extends: InteractiveCustomUIPage

UI page for summoning a new portal fragment world. Validates the player's held item as a portal key, checks for maximum concurrent fragments (limit: 4), and handles the async world spawn workflow. Manages the full lifecycle: item consumption, block state transitions (off -> spawning -> on), instance creation, return portal placement, and error handling.

## Hierarchy

- **Extends:** `InteractiveCustomUIPage`

## Methods

- build(Ref<EntityStore>, UICommandBuilder, UIEventBuilder, Store<EntityStore>) | void | Builds the summon UI with portal artwork, description, objectives, tips, timing breakdown, and summon button event bindings.
- handleDataEvent(Ref<EntityStore>, Store<EntityStore>, PortalDeviceSummonPage.Data) | void | Handles summon activation: spawns the instance world, configures world settings, places return portal, and transitions block state.
- createDescription(PortalType, int) | Message | Creates a portal description message with time limit formatting.
- computeState(Player, ComponentAccessor<EntityStore>) | PortalDeviceSummonPage.State | Validates all preconditions: block validity, active fragment count, held item, portal key, portal type, instance existence, not inside a portal, and gameplay config.

## Inner Types

### CanSpawnPortal

*record*

Record holding validated `PortalKey`, `PortalType`, `WorldChunk`, `BlockStateInfo`, `PortalDevice`, and `PortalGameplayConfig`.

### Data

*class*

Codec data class with `action` string field for UI event routing.

### Error

*enum*

Error states: `NOTHING_OFFERED`, `OFFERED_IS_NOT_HELD`, `NOT_A_PORTAL_KEY`, `INVALID_BLOCK`, `INVALID_DESTINATION`, `PORTAL_INSIDE_PORTAL`, `BOTCHED_GAMEPLAY_CONFIG`, `MAX_ACTIVE_PORTALS`.

### InstanceKeyNotFound

*record*

Record for missing instance ID errors.

### PortalTypeNotFound

*record*

Record for missing portal type ID errors.

### State

*sealed interface*

Sealed interface permitting `CanSpawnPortal`, `Error`, `InstanceKeyNotFound`, and `PortalTypeNotFound`.
