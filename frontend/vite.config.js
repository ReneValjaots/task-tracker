import {defineConfig, loadEnv} from 'vite'
import react from '@vitejs/plugin-react'

// https://vitejs.dev/config/
export default defineConfig(({ mode }) => {
  const env = loadEnv(mode, process.cwd(), '');

  const isDocker = env.VITE_IS_DOCKER === 'true';

  return {
    plugins: [react()],
    server: {
      host: true,
      strictPort: true,
      port: 5173,
      proxy: {
        // This will use the environment variable if it's set (for Docker),
        // and fall back to localhost if it's not (for local development).
        '/api': {
          target: isDocker ? 'http://backend:8080' : 'http://localhost:8080',
          changeOrigin: true,
        },
      },
    },
  };
});

