# ShutdownReason

Type: class | Package: com.hypixel.hytale.server.core

public class ShutdownReason

Represents the reason for a server shutdown, pairing an exit code with an optional human-readable message. Pre-defined constants cover standard scenarios (clean shutdown, crash, auth failure, world gen error, etc.). Instances are immutable; `withMessage` returns a new instance with the same exit code and the given message.

## Constants

- SIGINT | 130
- SHUTDOWN | 0
- CRASH | 1
- AUTH_FAILED | 2
- WORLD_GEN | 3
- CLIENT_GONE | 4
- MISSING_REQUIRED_PLUGIN | 5
- VALIDATE_ERROR | 6
- MISSING_ASSETS | 7
- UPDATE | 8
- MOD_ERROR | 9

## Methods

- public int getExitCode()
- public String getMessage()
- @Nonnull public ShutdownReason withMessage(String message)
