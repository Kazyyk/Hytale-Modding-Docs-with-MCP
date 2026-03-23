# EncryptedAuthCredentialStoreProvider

Type: class | Package: com.hypixel.hytale.server.core.auth | Implements: AuthCredentialStoreProvider

public class EncryptedAuthCredentialStoreProvider implements AuthCredentialStoreProvider

Factory that creates `EncryptedAuthCredentialStore` instances with a configurable file path. Validates that the path is within a trusted root directory.

## Constants


public static final String ID = "Encrypted"


public static final String DEFAULT_PATH = "auth.enc"

## Methods


@Nonnull
@Override
public IAuthCredentialStore createStore()

Creates an EncryptedAuthCredentialStore at the configured path. Throws `IllegalStateException` if the path is outside a trusted root directory.
