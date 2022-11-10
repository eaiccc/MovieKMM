import SwiftUI
import shared

struct ContentView: View {
    @ObservedObject private(set) var viewModel: ViewModel

	var body: some View {
        Text(viewModel.text)
	}
}

extension ContentView {
    class ViewModel: ObservableObject{
        @Published var text = "Loading..."
        init() {
            //Mark: ktor test
            //            Greeting().greeting { greeting, error in
            //                DispatchQueue.main.async {
            //                    if let greeting = greeting {
            //                        self.text = greeting
            //                    } else {
            //                        self.text = error?.localizedDescription ?? "error"
            //                    }
            //                }
            //
            //            }

            MovieApiImpl().fetchMovieFromApi()
            { response, error in
               DispatchQueue.main.async {
                   if let response = response {
                       self.text = "page: \(response.page) totoal result: \(response.total_results)"
                   } else {
                       self.text = error?.localizedDescription ?? "error"
                   }
               }

           }


        }
    }
}

