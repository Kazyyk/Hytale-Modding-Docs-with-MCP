# NetworkCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.utility.net | Extends: AbstractCommandCollection

public class NetworkCommand extends AbstractCommandCollection

Collection of network debugging commands under the `/network` (alias `/net`) command. Provides subcommands for latency simulation, QUIC stream priority tuning, and knockback debugging.

## Subcommands

### LatencySimulationCommand (`/net latencysimulation`, alias `/net latsim`)

Subcommand collection for simulating network latency on a target player's connection.

- **set** -- Sets artificial latency in milliseconds via the `LatencySimulationHandler`.
- **reset** -- Clears artificial latency.

### StreamPriorityCommand (`/net streampriority`, alias `/net sp`)

Subcommand collection for adjusting QUIC stream priority urgency values per `NetworkChannel`.

- **set** -- Sets priority for a specific channel.
- **preset** -- Applies a named preset (`default`, `equal`, `tiered`, `maplow`, `datalow`, `chunkshi`, `maphi`).
- **reset** -- Resets to default priorities.

### ServerKnockbackCommand (`/net serverknockback`)

Toggles server-side knockback prediction via `KnockbackSystems.ApplyPlayerKnockback.DO_SERVER_PREDICTION`.

### DebugKnockbackCommand (`/net debugknockback`)

Toggles knockback position debugging via `KnockbackPredictionSystems.DEBUG_KNOCKBACK_POSITION`.

Also in this package: DebugKnockbackCommand, LatencySimulationCommand, Preset, Reset, Reset, ServerKnockbackCommand, Set, Set, StreamPriorityCommand
