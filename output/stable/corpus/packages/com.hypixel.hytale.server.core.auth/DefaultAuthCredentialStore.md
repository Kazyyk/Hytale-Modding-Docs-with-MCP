# DefaultAuthCredentialStore

Type: class | Package: com.hypixel.hytale.server.core.auth | Implements: IAuthCredentialStore

public class DefaultAuthCredentialStore implements IAuthCredentialStore

In-memory credential store that does not persist tokens across restarts. Stores OAuth tokens and profile UUID in volatile fields.

## Methods

Implements all methods from IAuthCredentialStore. Stores tokens and profile UUID in volatile instance fields. `clear()` resets both to their default values.
