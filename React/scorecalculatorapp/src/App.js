import { CalculateScore } from './Components/CalculateScore';

function App() {
    return (
        <div>
            <CalculateScore
                Name="Sidney"
                School="DNV Public School"
                total={302}
                goal={600}
            />
        </div>
    );
}

export default App;