package br.com.alura.screenmatch.service;

import com.google.genai.Client;
import com.google.genai.types.GenerateContentResponse;

public class ConsultaGeminiAI {
    public static String obterInformacao(String texto) {
        // A API key é lida automaticamente da variável de ambiente GOOGLE_API_KEY.
        // Certifique-se de que a variável de ambiente GOOGLE_API_KEY esteja definida
        // no seu sistema antes de executar esta aplicação.
        // Para rodar este exemplo, você deve ter a variável de ambiente GOOGLE_API_KEY configurada.
        // Exemplo de como configurar (no terminal Linux/macOS):
        // export GOOGLE_API_KEY="SUA_API_KEY_AQUI"
        // Exemplo de como configurar (no terminal Windows - cmd):
        // set GOOGLE_API_KEY=SUA_API_KEY_AQUI
        // Exemplo de como configurar (no terminal Windows - PowerShell):
        // $env:GOOGLE_API_KEY="SUA_API_KEY_AQUI"
        Client client = new Client();

        GenerateContentResponse response = client.models.generateContent(
                "gemini-1.5-flash", // Recomenda-se usar gemini-1.5-flash ou superior para novas aplicações
                "Utilizando o idioma Português do Brasil, me fale sobre o artista: " + texto,
                null);
        return response.text();
    }
}